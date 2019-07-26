import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BasicUserViewEventsPageComponent } from './basic-user-view-events-page.component';

describe('BasicUserViewEventsPageComponent', () => {
  let component: BasicUserViewEventsPageComponent;
  let fixture: ComponentFixture<BasicUserViewEventsPageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BasicUserViewEventsPageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BasicUserViewEventsPageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
